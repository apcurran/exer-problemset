/**
 *
 * @param {string} str
 * @returns {boolean}
 */
export function isPangram(str) {
    const IS_ALPHA = /[a-z]/;
    const lowerStr = str.toLowerCase();
    let seenChars = new Set();

    for (let char of lowerStr) {
        if (!IS_ALPHA.test(char)) {
            continue;
        }

        seenChars.add(char);
    }

    return seenChars.size === 26;
}

console.log(isPangram("abcdefghijklmnopqrstuvwxyz")); // true
console.log(isPangram("five boxing wizards jump quickly at it")); // false
