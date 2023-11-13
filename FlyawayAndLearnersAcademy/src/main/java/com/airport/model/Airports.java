package com.airport.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AirportsInfo")
public class Airports {

		@Id
		@Column (name = "aid", nullable = false)
		private String aid;
		private String aname;
		private String acity;
		private String acountry;
		public String getAid() {
			return aid;
		}
		public void setAid(String aid) {
			this.aid = aid;
		}
		public String getAname() {
			return aname;
		}
		public void setAname(String aname) {
			this.aname = aname;
		}
		public String getAcity() {
			return acity;
		}
		public void setAcity(String acity) {
			this.acity = acity;
		}
		public String getAcountry() {
			return acountry;
		}
		public void setAcountry(String acountry) {
			this.acountry = acountry;
		} 
		
		
}
