package net.mcreator.fnafmod.procedures;

import net.minecraft.world.level.LevelAccessor;

public class GetTimeProcedure {
	public static double execute(LevelAccessor world, boolean getHour, boolean military_time) {
		double result = 0;
		double worldtime = 0;
		double hour = 0;
		double end_time = 0;
		double time = 0;
		double minute = 0;
		time = world.dayTime();
		end_time = world.dayTime();
		while (end_time > 24000) {
			end_time = end_time - 24000;
		}
		worldtime = end_time;
		if ((worldtime) > (17999) && (worldtime) < (19000)) {
			if (military_time == true) {
				hour = 12;
			} else {
				hour = 0;
			}
		} else if ((worldtime) > (18999) && (worldtime) < (19999) || (worldtime) > (6999) && (worldtime) < (8000) && military_time == false) {
			hour = 1;
		} else if ((worldtime) > (19999) && (worldtime) < (21000) || (worldtime) > (7999) && (worldtime) < (9000) && military_time == false) {
			hour = 2;
		} else if ((worldtime) > (20999) && (worldtime) < (22000) || (worldtime) > (8999) && (worldtime) < (10000) && military_time == false) {
			hour = 3;
		} else if ((worldtime) > (21999) && (worldtime) < (23000) || (worldtime) > (9999) && (worldtime) < (11000) && military_time == false) {
			hour = 4;
		} else if ((worldtime) > (22999) && (worldtime) < (24000) || (worldtime) > (10999) && (worldtime) < (12000) && military_time == false) {
			hour = 5;
		} else if ((worldtime) > ((-1)) && (worldtime) < (1000) || (worldtime) > (11999) && (worldtime) < (13000) && military_time == false) {
			hour = 6;
		} else if ((worldtime) > (999) && (worldtime) < (2000) || (worldtime) > (12999) && (worldtime) < (14000) && military_time == false) {
			hour = 7;
		} else if ((worldtime) > (1999) && (worldtime) < (3000) || (worldtime) > (13999) && (worldtime) < (15000) && military_time == false) {
			hour = 8;
		} else if ((worldtime) > (2999) && (worldtime) < (4000) || (worldtime) > (14999) && (worldtime) < (16000) && military_time == false) {
			hour = 9;
		} else if ((worldtime) > (3999) && (worldtime) < (5000) || (worldtime) > (15999) && (worldtime) < (17000) && military_time == false) {
			hour = 10;
		} else if ((worldtime) > (4999) && (worldtime) < (6000) || (worldtime) > (16999) && (worldtime) < (18000) && military_time == false) {
			hour = 11;
		}
		if (military_time == true) {
			if ((worldtime) > (6999) && (worldtime) < (8000)) {
				hour = 13;
			} else if ((worldtime) > (7999) && (worldtime) < (9000)) {
				hour = 14;
			} else if ((worldtime) > (8999) && (worldtime) < (10000)) {
				hour = 15;
			} else if ((worldtime) > (9999) && (worldtime) < (11000)) {
				hour = 16;
			} else if ((worldtime) > (10999) && (worldtime) < (12000)) {
				hour = 17;
			} else if ((worldtime) > (11999) && (worldtime) < (13000)) {
				hour = 18;
			} else if ((worldtime) > (12999) && (worldtime) < (14000)) {
				hour = 19;
			} else if ((worldtime) > (13999) && (worldtime) < (15000)) {
				hour = 20;
			} else if ((worldtime) > (14999) && (worldtime) < (16000)) {
				hour = 21;
			} else if ((worldtime) > (15999) && (worldtime) < (17000)) {
				hour = 22;
			} else if ((worldtime) > (16999) && (worldtime) < (18000)) {
				hour = 23;
			}
		}
		if ((worldtime) > (5999) && (worldtime) < (7000)) {
			hour = 12;
		}
		end_time = world.dayTime();
		while (end_time > 1000) {
			end_time = end_time - 1000;
		}
		minute = Math.round(Math.pow(10, 0) * ((end_time * 59) / 999)) / Math.pow(10, 0);
		if (getHour == true) {
			result = hour + 0;
		} else {
			result = minute + 0;
			if (result == 60) {
				result = 0;
			}
		}
		return result;
	}
}
