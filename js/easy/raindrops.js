/**
 * solution 1
 * time: O(1)
 * space: O(1)
 *
 * @param {number} num
 * @returns {string}
 */
export function convert(num) {
    let result = "";
    // is divisible by 3, add "Pling" to the result.
    if (num % 3 === 0) {
        result += "Pling";
    }

    // is divisible by 5, add "Plang" to the result.
    if (num % 5 === 0) {
        result += "Plang";
    }

    // is divisible by 7, add "Plong" to the result.
    if (num % 7 === 0) {
        result += "Plong";
    }

    return result || String(num);
}
