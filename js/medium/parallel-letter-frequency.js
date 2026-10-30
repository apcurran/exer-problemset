import { Worker, isMainThread, parentPort, workerData } from "node:worker_threads";

/**
 * helper fn
 *
 * @param {string} text
 * @returns {Promise}
 */
function countInWorker(text) {
    return new Promise((resolve, reject) => {
        const worker = new Worker(new URL(import.meta.url), { workerData: text });
        worker.once("message", resolve);
        worker.once("error", reject);
    });
}

/**
 * solution 1
 *
 * @param {string[]} texts
 * @returns {object}
 */
export async function parallelLetterFrequency(texts) {
    const partials = await Promise.all(texts.map((text) => countInWorker(text)));
    let totals = {};

    for (let partial of partials) {
        for (let [letter, count] of Object.entries(partial)) {
            totals[letter] = (totals[letter] ?? 0) + count;
        }
    }

    return totals;
}

// worker thread
if (!isMainThread) {
    const loweredText = workerData.toLowerCase();
    const IS_LETTER_REGEX = /\p{L}/u;
    let counts = {};

    for (let char of loweredText) {
        if (!IS_LETTER_REGEX.test(char)) {
            continue;
        }

        const previousCharCount = counts[char] ?? 0;
        counts[char] = previousCharCount + 1;
    }

    parentPort.postMessage(counts);
}
