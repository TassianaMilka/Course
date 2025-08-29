import {Router} from "express";
import { getPlayer } from "./controllers/playerController";
import * as PlayerController from "./controllers/players-controller";
import * as ClubController from "./controllers/clubs-controller";

const router = Router()

router.get("/api", getPlayer);
router.post("/players")
router.delete("/players/:id", PlayerController.deletePlayer);

router.get("/players/:id", PlayerController.getPlayerById);
router.get("/clubs", ClubController.getClubs);





export default router;


