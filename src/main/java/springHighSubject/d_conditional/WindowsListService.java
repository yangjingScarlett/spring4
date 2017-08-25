package springHighSubject.d_conditional;

import org.springframework.stereotype.Service;

/**
 * @author Yangjing
 */
@Service
public class WindowsListService implements ListService {
    public String showListCmd() {
        return "dir";
    }
}
