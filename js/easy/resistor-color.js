/**
 * solution 1
 * time: O(n)
 * space: O(1)
 *
 * @param {string} color
 * @returns {number}
 */
export function colorCode(color) {
    return COLORS.indexOf(color);
}

export const COLORS = [
    "black",
    "brown",
    "red",
    "orange",
    "yellow",
    "green",
    "blue",
    "violet",
    "grey",
    "white",
];
