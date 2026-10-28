/**
 * solution 1
 * time: O(log n)
 * space: O(1)
 *
 * @param {number[]} arr
 * @param {number} target
 * @returns {number}
 */
export function find(arr, target) {
    let left = 0;
    let right = arr.length - 1;

    while (left <= right) {
        // find the middle of sorted list and compare to target
        const middleIndex = Math.floor((left + right) / 2);
        const value = arr[middleIndex];

        if (value < target) {
            // throw away left half
            left = middleIndex + 1;
        } else if (value > target) {
            // throw away right half
            right = middleIndex - 1;
        } else {
            // matching value === target
            return middleIndex;
        }
    }

    // no item found (not in arr)
    throw new Error("Value not in array");
}

const arr = [4, 8, 12, 16, 23, 28, 32];
console.log(find(arr, 23)); // 4
console.log(find(arr, 2)); // Error.message -> "Value not in array"
