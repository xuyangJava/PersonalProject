package com.sipingsoft.office.core.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ResponseStatus将SpittleNotFoundException映射为404的状态码
 * @date 2017年2月16日 下午3:34:22
 * @author yangxu
 */
@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="Spittle Not Found")
public class SpittleNotFoundException extends RuntimeException {

}
