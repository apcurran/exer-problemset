/**
 * solution 1 -- hash map
 * time: O(n)
 * space: O(1) -- not including results string
 *
 * @param {string} dnaChars
 * @returns {string}
 */
export function toRna(dnaChars) {
    const dnaToRnaMap = new Map([
        ["G", "C"],
        ["C", "G"],
        ["T", "A"],
        ["A", "U"],
    ]);

    let result = "";

    for (let dnaChar of dnaChars) {
        const convertedRnaChar = dnaToRnaMap.get(dnaChar) || "";
        result += convertedRnaChar;
    }

    return result;
}

console.log(toRna("ACGTGGTCTTAA")); // "UGCACCAGAAUU"
