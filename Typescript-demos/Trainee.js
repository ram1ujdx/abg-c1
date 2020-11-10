"use strict";
exports.__esModule = true;
exports.TraineeImpl = void 0;
var TraineeImpl = /** @class */ (function () {
    function TraineeImpl() {
        this.email = 'harsh@yahoo.com';
        this.traineeName = 'Harsh';
        this.traineeId = 154512;
    }
    TraineeImpl.prototype.showTrainee = function (x) {
        console.log(this);
        console.log(x);
    };
    return TraineeImpl;
}());
exports.TraineeImpl = TraineeImpl;
