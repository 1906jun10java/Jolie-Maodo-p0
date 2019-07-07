package com.mj.beans;

	public class Lot {

		private int lotcapaty;
		private String lottype;

		public int getLotcapaty() {
			return lotcapaty;
		}

		public void setLotcapaty(int lotcapaty) {
			this.lotcapaty = lotcapaty;
		}

		public String getLottype() {
			return lottype;
		}

		public void setLottype(String lottype) {
			this.lottype = lottype;
		}
		
		public static void main(String[] args) {
		
		Lot L1 = new Lot();
		L1.setLotcapaty(2000);
		L1.setLottype("Brand New Cars");
		
		Lot L2 = new Lot();
		L2.setLotcapaty(1000);
		L2.setLottype("Used Cars");
		
	}
}
