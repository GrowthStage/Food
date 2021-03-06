package domain;

import java.sql.Timestamp;

/**
 * Favorite entity. @author MyEclipse Persistence Tools
 */

public class Favorite implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer uid;
	private Integer cid;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Favorite() {
	}

	/** minimal constructor */
	public Favorite(Integer uid, Integer cid) {
		this.uid = uid;
		this.cid = cid;
	}

	/** full constructor */
	public Favorite(Integer uid, Integer cid, Timestamp time) {
		this.uid = uid;
		this.cid = cid;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getCid() {
		return this.cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}