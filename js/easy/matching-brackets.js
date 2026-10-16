/**
 * ignore all non-bracket chars
 * determine if valid bracket matches
 * solution 1
 * time: O(n)
 * space: O(n)
 *
 * @param {string} str
 * @returns {boolean}
 */
export function isPaired(str) {
    const matchPairs = new Map([
        ["}", "{"],
        ["]", "["],
        [")", "("],
    ]);
    const openers = new Set(matchPairs.values());
    let stack = [];

    for (let currChar of str) {
        if (openers.has(currChar)) {
            stack.push(currChar);
        } else if (matchPairs.has(currChar)) {
            if (stack.pop() !== matchPairs.get(currChar)) {
                return false;
            }
        }
    }

    return stack.length === 0;
}

console.log(isPaired("[]")); // true
console.log(isPaired("[[")); // false
