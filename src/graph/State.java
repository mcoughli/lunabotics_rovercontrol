package graph;

public enum State {
	START,
	ORIENTATION,
	EXCAVATE,
	MOVE_TO_CENTER,
	COLLECT_SNAPSHOTS,
	MOVE_TO_EXCAVATE,
	MOVE_TO_DUMPING,
	BACKUP_AND_DUMP,
	END, WAIT
}
