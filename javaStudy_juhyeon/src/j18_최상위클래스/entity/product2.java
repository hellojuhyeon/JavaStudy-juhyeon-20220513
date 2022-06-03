package j18_최상위클래스.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@RequiredArgsConstructor

public class product2 {
	@NonNull
	private final int productCode;//생성 시 무조건 값이 초기화가 
	//되어야해서 @NoArgsConstructor는 동시에 사용불가
	private String productName;
	private int category;
	private LocalDate productionDate;
}

