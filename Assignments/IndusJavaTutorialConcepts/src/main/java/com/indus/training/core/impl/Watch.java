package com.indus.training.core.impl;

import com.indus.training.core.domain.WatchInput;
import com.indus.training.core.domain.WatchOutput;
import com.indus.training.core.svc.IWatch;

public class Watch implements IWatch {

	protected WatchModel wm;

	public Watch(WatchModel wm) {
		this.wm = wm;
	}

	public String getTime() {
		return "12:00 PM";
	}

	public WatchOutput getWatchDetails() {

		WatchInput input = wm.getWatchInput();

		String details = "Brand: " + input.getBrand() + ", Model: " + input.getModel() + ", Year: " + input.getYear();

		return new WatchOutput(details);
	}

	public static class DigitalWatch extends Watch {

		public DigitalWatch(WatchModel wm) {

			super(wm);

		}

		public String getDate() {

			return "07/26/2024";
		}

		public WatchOutput getWatchDetails() {

			WatchOutput output = super.getWatchDetails();

			String updatedDetails = output.getDetails() + ", Date: " + getDate();

			return new WatchOutput(updatedDetails);
		}
	}
}