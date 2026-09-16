// For each magical item, take the base value and find all the multiples of that value that are less than the level number.
// Combine the sets of numbers.
// Remove any duplicates.
// Calculate the sum of all the numbers that are left.

/**
 * solution 1 -- Set
 *
 * @param {number[]} multiples
 * @param {number} limit
 * @returns {number} sum
 */
export function sum(multiples, limit) {
    let uniqueValues = new Set();

    for (let multiple of multiples) {
        if (multiple === 0) {
            continue;
        }

        for (let j = multiple; j < limit; j += multiple) {
            uniqueValues.add(j);
        }
    }

    let uniqueValuesTotal = 0;

    for (let val of uniqueValues) {
        uniqueValuesTotal += val;
    }

    return uniqueValuesTotal;
}

console.log(sum([3, 5], 10)); // 23
console.log(sum([43, 47], 10000)); // 2203160
