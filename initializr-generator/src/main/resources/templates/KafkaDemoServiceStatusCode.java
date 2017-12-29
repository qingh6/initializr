package {{packageName}};

import com.kafka.foundation.api.exception.ServiceStatusCode;

public class {{kafkaName}}ServiceStatusCode extends ServiceStatusCode{
    private static final long serialVersionUID = 1L;

    // @formatter:off
    public static final {{kafkaName}}ServiceStatusCode
//            SERVER_INSUFFICIENT_BALANCE             = new KafkaDemoServiceStatusCode("400100", "余额不足");
    // @formatter:on

    protected {{kafkaName}}ServiceStatusCode(String code, String message, Object... arguments) {
        super(code, message, arguments);
    }

    @Override
    public {{name}}_name_ServiceStatusCode copy(String customMessage, Object... arguments) {
        return new {{name}}_name_ServiceStatusCode(getCode(), customMessage, arguments);
    }
}
