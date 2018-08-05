class minesweeper {
    annotate(board) {
        if (board.length === 0) {
            return board;
        }
        let gameBoard = {};
        let mines = [];
        let space = [];

        for (let i = 0; i < board.length; i++) {
            gameBoard[i] = board[i].split('');
        }
        let boardX = gameBoard['0'].length;
        let boardY = board.length;

        for (let i in board) {
            let row = board[i].split('');
            for (let j in row) {
                if (row[j] === ' ') {
                    space.push([i, j]);
                } else {
                    mines.push([i, j]);
                }
            }
        }

        if (mines.length === 0) {
            return board;
        } else if (space.length === 0) {
            return board;
        } else {
            for (let i of mines) {
                let y = i[0];
                let x = i[1];
                gameBoard = this.calculate(gameBoard, parseInt(x), parseInt(y), boardX, boardY);
            }
        }
        const flatten = this.flatten(gameBoard);
        return flatten;
    }

    calculate(gameboard, x, y, xMax, yMax) {
        for (let myY = y-1; myY <= y+1; myY++) {
            for (let myX = x-1; myX <= x+1; myX ++) {
                if ((myY >= 0) && (myY <= yMax - 1) && (myX >= 0) && (myX <= xMax - 1)) {
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

    flatten(gameboard) {
        let board = [];
        for (let row of Object.values(gameboard)) {
            board.push(row.join(''));
        }
        return board;
    }
}

export default minesweeper;
