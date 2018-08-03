class Leap {
    constructor(year) {
        this.year = year;
    }
    isLeap() {
        if(!(this.year % 400)) {
            return true;
        } else if(!(this.year % 100)) {
            return false;
        } else if(!(this.year % 4)) {
            return true;
        } else {
            return false;
        }
    }
}

export default Leap;
