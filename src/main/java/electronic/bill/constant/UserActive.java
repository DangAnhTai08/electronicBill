package electronic.bill.constant;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum UserActive {

    USER_ACTIVE(0, false),
    USER_NO_ACTIVE(1, true);

    private final int status;
    private final boolean active;
}
