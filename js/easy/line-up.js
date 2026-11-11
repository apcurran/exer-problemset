/**
 * solution 1
 * time: O(1)
 * space: O(1)
 *
 * @param {string} name
 * @param {number} num
 * @returns {string}
 */
export function format(name, num) {
    const numLastTwoDigits = num % 100;
    const numLastDigit = num % 10;
    let formattedOrdinalNum = "";

    if (numLastTwoDigits === 11 || numLastTwoDigits === 12 || numLastTwoDigits === 13) {
        formattedOrdinalNum = `${num}th`;
    } else if (numLastDigit === 1) {
        formattedOrdinalNum = `${num}st`;
    } else if (numLastDigit === 2) {
        formattedOrdinalNum = `${num}nd`;
    } else if (numLastDigit === 3) {
        formattedOrdinalNum = `${num}rd`;
    } else {
        formattedOrdinalNum = `${num}th`;
    }

    return `${name}, you are the ${formattedOrdinalNum} customer we serve today. Thank you!`;
}

console.log(format("Washi", 21)); // 'Washi, you are the 21st customer we serve today. Thank you!'
