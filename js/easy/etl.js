/**
 * Transforms legacy score data into the new format.
 * solution 1
 * L = total letters across all input arrays
 * time: O(L)
 * space: O(L) (≤ 26 keys for an alphabet)
 *
 * @param {Object<number, string[]>} oldObj - Point values mapped to arrays of uppercase letters, e.g. { 1: ['A', 'E'] }
 * @returns {Object<string, number>} Lowercase letters mapped to their point values, e.g. { a: 1, e: 1 }
 */
export function transform(oldObj) {
    let results = {};

    for (let strNumKey in oldObj) {
        const letters = oldObj[strNumKey];
        const points = Number(strNumKey);

        for (let char of letters) {
            const lowerChar = char.toLowerCase();
            // add char to obj as key and value in points
            results[lowerChar] = points;
        }
    }

    return results;
}

console.log(transform({ 1: ["A", "E", "I", "O", "U"] }));
// {
//   a: 1,
//   e: 1,
//   i: 1,
//   o: 1,
//   u: 1,
// };

console.log(transform({ 1: ["A", "E"], 2: ["D", "G"] }));
// {
//   a: 1,
//   e: 1,
//   d: 2,
//   g: 2,
// };
