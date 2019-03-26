package IMS.demo.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author IMS
 * Created on 2017/10/13
 */
@Data
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> implements Serializable{
    private static final long serialVersionUID = 8575050351782549538L;
    /**
     * 错误码
     */
    private int code;

    private String msg;

    private T data;
}
