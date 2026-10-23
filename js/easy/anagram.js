/**
 * solution 1 -- sorting
 *
 * @param {string} word
 * @param {string[]} possibleAnagrams
 * @returns {string[]}
 */
export function findAnagrams(word, possibleAnagrams) {
    const loweredWord = word.toLowerCase();
    const sortedWord = loweredWord.split("").sort().join("");
    let results = [];

    for (let possibleAnagram of possibleAnagrams) {
        const loweredPossibleAnagram = possibleAnagram.toLowerCase();

        if (loweredPossibleAnagram === loweredWord) {
            continue;
        }

        const sortedPossibleAnagram = loweredPossibleAnagram.split("").sort().join("");

        if (sortedWord === sortedPossibleAnagram) {
            results.push(possibleAnagram);
        }
    }

    return results;
}

console.log(findAnagrams("solemn", ["lemons", "cherry", "melons"])); // ['lemons', 'melons']
