class Queens {
    constructor({ white, black } = { white: [0, 3], black: [7, 3] }) {
        this.white = white;
        this.black = black;
        if (this.arrayEqual()) {
            throw 'Queens cannot share the same space';
        }
    }

    canAttack() {
        for (let i = 0; i < 2; i++) {
            if (this.white[i] === this.black[i]) {
                return true;
            }
        }
        if (Math.abs(this.white[0] - this.black[0]) === Math.abs(this.white[1] - this.black[1])) {
            return true;
        }
        return false;
    }

    arrayEqual() {
        for (let i = 0; i < 2; i++) {
            if(this.white[i] !== this.black[i]) {
                return false;
            }
        }
        return true;
    }

    toString() {
        let board = [];
        for (let y = 0; y < 8; y++) {
            let row = '';
            for (let x = 0; x < 8; x++) {
                if (this.white[1] === x && this.white[0] === y) {
                    row += 'W';
                } else if (this.black[1] === x && this.black[0] === y) {
                    row += 'B';
                } else {
                    row += '_';
                }
                (x < 7) ? row += ' ' : true;
            }
            y === 7 ? row += '\n' : true;
            board.push(row);
        }
        return board.join('\n');
    }
}

export default Queens;
