export class BuyInsurance {
    constructor(public planType?:number,
        public dateAndTime?: Date,
        public vehicleType?: String,
        public model?: String,
        public drivingLicense?:String,
        public engineNumber?:String
    ){}
}