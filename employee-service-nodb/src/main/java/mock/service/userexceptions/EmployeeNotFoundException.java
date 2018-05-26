package mock.service.userexceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(reason="This Employee is not found in the system")
public class EmployeeNotFoundException extends Exception{

}
