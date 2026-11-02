/**
 * solution 1 -- iterative
 * time: O(n)
 * space: O(n)
 *
 * @param {number} displayValue
 * @returns {number}
 */
export function eggCount(displayValue) {
    // convert to bin str
    const binStr = displayValue.toString(2);
    // count 1 bits
    let oneBitsCount = 0;

    for (let bitStr of binStr) {
        if (bitStr === "1") {
            oneBitsCount++;
        }
    }

    return oneBitsCount;
}

console.log(eggCount(89)); // 4
