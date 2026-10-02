/**
 * solution 1
 * time: O(n)
 * space: O(1) -- not including results array
 *
 * @param {string} sequence
 * @returns {string[]}
 */
export function translate(sequence) {
    let results = [];

    if (!sequence) {
        return results;
    }

    const codonMap = new Map([
        ["AUG", "Methionine"],
        ["UUU", "Phenylalanine"],
        ["UUC", "Phenylalanine"],
        ["UUA", "Leucine"],
        ["UUG", "Leucine"],
        ["UCU", "Serine"],
        ["UCC", "Serine"],
        ["UCA", "Serine"],
        ["UCG", "Serine"],
        ["UAU", "Tyrosine"],
        ["UAC", "Tyrosine"],
        ["UGU", "Cysteine"],
        ["UGC", "Cysteine"],
        ["UGG", "Tryptophan"],
        ["UAA", "STOP"],
        ["UAG", "STOP"],
        ["UGA", "STOP"],
    ]);

    for (let i = 0; i < sequence.length; i += 3) {
        const sequenceChunk = sequence.slice(i, i + 3);
        const codon = codonMap.get(sequenceChunk);

        if (codon === undefined) {
            throw new Error("Invalid codon");
        }

        if (codon === "STOP") {
            break;
        }

        results.push(codon);
    }

    return results;
}

console.log(translate()); // []
console.log(translate("UUUUUU")); // ['Phenylalanine', 'Phenylalanine']
console.log(translate("AUGUUUUGG")); // ["Methionine", "Phenylalanine", "Tryptophan"]
console.log(translate("UAGUGG")); // []
