/**
 *
 * @param {string} strand
 * @returns {string} 4 numbers separated by spaces. Each number represents the count for A, C, G and T in this order.
 */
export function countNucleotides(strand) {
    const VALID_DNA_CHARS = "ACGT";
    let charCounts = new Map([
        ["A", 0],
        ["C", 0],
        ["G", 0],
        ["T", 0],
    ]);

    for (let char of strand) {
        if (!VALID_DNA_CHARS.includes(char)) {
            throw new Error("Invalid nucleotide in strand");
        }

        const previousCharCount = charCounts.get(char);
        charCounts.set(char, previousCharCount + 1);
    }

    let results = [];

    for (let [, charCount] of charCounts) {
        results.push(charCount);
    }

    return results.join(" ");
}

console.log(
    countNucleotides("AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC"),
); // '20 12 17 21'
