package com.programming.class1;

public class IndianTeam implements ISports, IFootball, IHockey {

	@Override
	public void setHomeTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println("Home team is " + name);

	}

	@Override
	public void setVisitingTeam(String name) {
		// TODO Auto-generated method stub
		System.out.println("Visiting team is " + name);

	}

	@Override
	public void setVenue(String name) {
		// TODO Auto-generated method stub
		System.out.println("Venue: " + name);
	}

	@Override
	public void setHomeTeamGoalsScored(int goals) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVisitingTeamGoalsScored(int goals) {
		// TODO Auto-generated method stub

	}

	@Override
	public void overTimeDuration(int hrs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setHomeTeamPointsScored(int points) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setVisitingTeamPointsScored(int points) {
		// TODO Auto-generated method stub

	}

	@Override
	public void endOfQuarters(int noOfQuartersPlayed) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		IndianTeam obj = new IndianTeam();
		obj.setHomeTeam("India");
		obj.setVisitingTeam("England");
		obj.setVenue("Pune");
		System.out.println("Players: " + defaultNumberOfPlayers);
	}

}
