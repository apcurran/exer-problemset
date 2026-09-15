/**
 * @typedef {number | null | NestedArray} NestedArrayItem
 * @typedef {NestedArrayItem[]} NestedArray
 */

/**
 *
 * @param {NestedArray} items
 * @returns {number[]}
 */
export function flatten(items) {
    const flattenedItems = items.flat(Infinity);

    return flattenedItems.filter(function removeNullVals(val) {
        return val !== null;
    });
}

console.log(flatten([1, [2, 6, null], [[null, [4]], 5]])); // [1, 2, 6, 4, 5]
