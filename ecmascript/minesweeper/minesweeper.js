class minesweeper {
    annotate(board) {
        if (board.length === 0) {
            return board;
        }
        let gameBoard = [];
        let gameBoard2 = {};
        let mines = [];
        let space = [];

        for (let i = 0; i < board.length; i++) {
            gameBoard2[i] = board[i].split('');
        }
        let boardX = gameBoard2['0'].length;
        let boardY = board.length;

        for (let i in board) {
            let row = board[i].split('');
            gameBoard.push(row);
            for (let j in row) {
                if (row[j] === ' ') {
                    space.push([i, j]);
                } else {
                    mines.push([i, j]);
                }
            }
        }
        console.log(space);
        console.log(mines);
        // console.log(gameBoard);
        // console.log(gameBoard2);
        if (mines.length === 0) {
            return board;
        } else if (space.length === 0) {
            return board;
        } else {
            for (let i of mines) {
                let x = i[0];
                let y = i[1];
                gameBoard2 = this.calculate(gameBoard2, x, y, boardX, boardY);
                // console.log(gameBoard2);
            }
        }
        let flatten = this.flatten(gameBoard2);
        console.log(flatten);
        return flatten;

        // return gameboard;
    }
    calculate(gameboard, x, y, xMax, yMax) {
        console.log(x, y, xMax, yMax);
        for (let myY = y-1; myY <= y+1; myY++) {
            for (let myX = x-1; myX <= x+1; myX ++) {
                // console.log(myX, myY);
                if ((myY >= 0) && (myY <= yMax - 1) && (myX >= 0) && (myX <= xMax - 1)) {
                    // console.log(gameboard[myY.toString()][myX]);
                    let val = gameboard[myY.toString()][myX];
                    if (val !== '*') {
                        if (val === ' ') {
                            gameboard[myY.toString()][myX] = 1;
                        } else {
                            gameboard[myY.toString()][myX] += 1;
                        }
                    }
                }
            }
        }
        return gameboard;
    }
    flatten(gameboard, callback) {
        let board = [];
        for (let row of Object.values(gameboard)) {
            board.push(row.join(''));
        }
        return board;
    }
}

export default minesweeper;
