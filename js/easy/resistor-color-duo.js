// const COLORS = new Map([
//     ["black", 0],
//     ["brown", 1],
//     ["red", 2],
//     ["orange", 3],
//     ["yellow", 4],
//     ["green", 5],
//     ["blue", 6],
//     ["violet", 7],
//     ["grey", 8],
//     ["white", 9],
// ]);

// /**
//  * solution 1 -- functional approach
//  * time: O(1)
//  * space: O(1)
//  *
//  * @param {string} colors
//  * @returns {number}
//  */
// export function decodedValue(colors) {
//     // only get first two colors
//     return colors
//         .slice(0, 2)
//         .map(function getNumFromColor(color) {
//             return COLORS.get(color);
//         })
//         .reduce(function addDigits(prevDigit, currDigit) {
//             const strNum = `${prevDigit}${currDigit}`;

//             return Number(strNum);
//         }, 0);
// }

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

/**
 * solution 2 -- math
 * time: O(1)
 * space: O(1)
 *
 * @param {string} colors
 * @returns {number}
 */
export function decodedValue(colors) {
    const a = COLORS.indexOf(colors[0]) * 10;
    const b = COLORS.indexOf(colors[1]);

    return a + b;
}

console.log(decodedValue(["green", "brown", "orange"])); // 51
