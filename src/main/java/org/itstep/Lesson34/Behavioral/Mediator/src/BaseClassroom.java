package org.itstep.Lesson34.Behavioral.Mediator.src;

interface BaseClassroom {
	void Send(String from, String to, String message);
	void Register(Trainee trainee);
}
