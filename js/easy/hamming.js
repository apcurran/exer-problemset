/**
 * solution 1
 * time: O(n)
 * space: O(1)
 *
 * @param {string} dna1
 * @param {string} dna2
 * @returns {number} count of differences between strand 1 and 2
 */
export function compute(dna1, dna2) {
    if (dna1.length !== dna2.length) {
        throw new Error("strands must be of equal length");
    }

    let counter = 0;
    // otherwise, same lengths
    for (let i = 0; i < dna1.length; i++) {
        const dna1Char = dna1[i];
        const dna2Char = dna2[i];

        if (dna1Char !== dna2Char) {
            counter++;
        }
    }

    return counter;
}

console.log(compute("GGACTGAAATCTG", "GGACTGAAATCTG")); // 0
console.log(compute("GGACGGATTCTG", "AGGACGGATTCT")); // 9
