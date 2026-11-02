// /**
//  * solution 1 -- iterative
//  * time: O(n)
//  * space: O(n)
//  *
//  * @param {number} displayValue
//  * @returns {number}
//  */
// export function eggCount(displayValue) {
//     // convert to bin str
//     const binStr = displayValue.toString(2);
//     // count 1 bits
//     let oneBitsCount = 0;

//     for (let bitStr of binStr) {
//         if (bitStr === "1") {
//             oneBitsCount++;
//         }
//     }

//     return oneBitsCount;
// }

/**
 * solution 2 -- Kerningham's trick
 * m = total bits
 * time: O(m)
 * space: O(1)
 *
 * @param {number} displayValue
 * @returns {number}
 */
export function eggCount(displayValue) {
    let n = displayValue;
    let oneBitsCount = 0;

    while (n > 0) {
        n &= n - 1; // clears lowest set bit
        oneBitsCount++; // increment counter for current 1 bit
    }

    return oneBitsCount;
}

console.log(eggCount(89)); // 4
