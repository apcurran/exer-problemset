/**
 * solution 1 -- hash map
 * time: O(1)
 * space: O(1)
 *
 * @param {string} planet
 * @param {number} ageInSeconds
 * @returns {number} - age in planet years
 */
export const age = (planet, ageInSeconds) => {
    const ONE_EARTH_YR_SECONDS = 31_557_600;
    const planetsToEarthYears = new Map([
        ["mercury", 0.2408467],
        ["venus", 0.61519726],
        ["earth", 1.0],
        ["mars", 1.8808158],
        ["jupiter", 11.862615],
        ["saturn", 29.447498],
        ["uranus", 84.016846],
        ["neptune", 164.79132],
    ]);
    // age in seconds / planet time in seconds (round to 2 decimal places)
    const planetMultiplier = planetsToEarthYears.get(planet);

    if (planetMultiplier === undefined) {
        throw new Error("not a planet");
    }

    const planetTimeSeconds = ONE_EARTH_YR_SECONDS * planetMultiplier;

    return Number((ageInSeconds / planetTimeSeconds).toFixed(2));
};

console.log(age("earth", 1000000000)); // 31.69
