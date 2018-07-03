package com.juancrud.gym.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class MeasurementItemLine extends EntityWithId {
	
	@OneToOne()
	@JoinColumn(name = "MeasurementId")
	private Measurement measurement;
	
	@Column(name="Value")
	private double value;
	
	@ManyToOne
	@JoinColumn(name = "MeasurementItemId")
	private MeasurementItem measurementItem;
	
	public MeasurementItemLine() {
	}
	
	public MeasurementItemLine(Measurement measurement, double value) {
		setMeasurement(measurement);
		setValue(value);
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof MeasurementItemLine)) return false;
		return getId() != null && getId().equals(((MeasurementItemLine)o).getId());
	}
	
	@Override
	public int hashCode() {
		return 33;
	}

	public Measurement getMeasurement() {
		return measurement;
	}

	public void setMeasurement(Measurement measurement) {
		this.measurement = measurement;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public MeasurementItem getMeasurementItem() {
		return measurementItem;
	}

	public void setMeasurementItem(MeasurementItem measurementItem) {
		this.measurementItem = measurementItem;
	}
	
}
