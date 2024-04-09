package edu.java.data.initialstatescreeners;

import edu.java.data.dto.Link;
import edu.java.linkupdatescheduler.exceptions.IncorrectHostException;

public interface InitialStateScreener {

    void saveInitialState(Link link) throws IncorrectHostException;

}
