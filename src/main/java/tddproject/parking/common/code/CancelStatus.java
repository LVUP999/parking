package tddproject.parking.common.code;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum CancelStatus {

	Y("예약취소"),
	N("예약");

	private final String text;
}
