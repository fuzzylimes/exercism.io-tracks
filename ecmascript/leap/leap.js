class Leap {
    constructor(year) {
        this.year = year;
    }
    isLeap() {
        return !(this.year % 400) || ((this.year % 100) && !(this.year % 4));
    }
}

export default Leap;
