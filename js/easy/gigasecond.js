/**
 * solution 1
 * time: O(1)
 * space: O(1)
 *
 * @param {Date} time
 * @returns {Date}
 */
export function gigasecond(time) {
    // use milliseconds to add in order to avoid Daylight Saving Time change issue
    const GIGA_TIME_MS = 1_000_000_000 * 1_000;

    return new Date(time.getTime() + GIGA_TIME_MS);
}

const gs = gigasecond(new Date(Date.UTC(2011, 3, 25)));
const expectedDate = new Date(Date.parse("2043-01-01T01:46:40Z"));
console.log(gs, expectedDate, gs.getTime() === expectedDate.getTime());
