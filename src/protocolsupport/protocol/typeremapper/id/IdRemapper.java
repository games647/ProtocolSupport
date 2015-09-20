package protocolsupport.protocol.typeremapper.id;

import protocolsupport.api.ProtocolVersion;
import protocolsupport.utils.ProtocolVersionsHelper;

public class IdRemapper {

	public static final RemappingReigstry BLOCK = new RemappingReigstry() {
		{
			// slime -> emerald block
			registerRemapEntry(165, 133, ProtocolVersionsHelper.BEFORE_1_8);
			// barrier -> glass
			registerRemapEntry(166, 20, ProtocolVersionsHelper.BEFORE_1_8);
			// iron trapdoor -> trapdoor
			registerRemapEntry(167, 96, ProtocolVersionsHelper.BEFORE_1_8);
			// prismarine -> mossy cobblestone
			registerRemapEntry(168, 48, ProtocolVersionsHelper.BEFORE_1_8);
			// sea lantern -> glowstone
			registerRemapEntry(169, 89, ProtocolVersionsHelper.BEFORE_1_8);
			// standing banner -> standing sign
			registerRemapEntry(176, 63, ProtocolVersionsHelper.BEFORE_1_8);
			// wall banner -> wall sign
			registerRemapEntry(177, 68, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone -> sandstone
			registerRemapEntry(179, 24, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone stairs -> sandstone stairs
			registerRemapEntry(180, 128, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone doubleslab -> double step
			registerRemapEntry(181, 43, ProtocolVersionsHelper.BEFORE_1_8);
			// red sandstone slab -> step
			registerRemapEntry(182, 44, ProtocolVersionsHelper.BEFORE_1_8);
			// all fence gates -> fence gate
			registerRemapEntry(183, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(184, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(185, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(186, 107, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(187, 107, ProtocolVersionsHelper.BEFORE_1_8);
			// all fences -> fence
			registerRemapEntry(188, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(189, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(190, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(191, 85, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(192, 85, ProtocolVersionsHelper.BEFORE_1_8);
			// all doors -> door
			registerRemapEntry(193, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(194, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(195, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(196, 64, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(197, 64, ProtocolVersionsHelper.BEFORE_1_8);
			// inverted daylight detector -> daylight detector
			registerRemapEntry(178, 151, ProtocolVersionsHelper.BEFORE_1_8);
			// stained glass -> glass
			registerRemapEntry(95, 20, ProtocolVersionsHelper.BEFORE_1_7);
			// stained glass pane -> glass pane
			registerRemapEntry(160, 102, ProtocolVersionsHelper.BEFORE_1_7);
			// leaves2 -> leaves
			registerRemapEntry(161, 18, ProtocolVersionsHelper.BEFORE_1_7);
			// log2 -> log
			registerRemapEntry(162, 17, ProtocolVersionsHelper.BEFORE_1_7);
			// acacia stairs -> oak stairs
			registerRemapEntry(163, 53, ProtocolVersionsHelper.BEFORE_1_7);
			// dark oak stairs -> oak stairs
			registerRemapEntry(164, 53, ProtocolVersionsHelper.BEFORE_1_7);
			// stained clay -> clay
			registerRemapEntry(159, 82, ProtocolVersion.MINECRAFT_1_5_2);
			// hay bale -> stone
			registerRemapEntry(170, 1, ProtocolVersion.MINECRAFT_1_5_2);
			// carpet -> stone pressure plate
			registerRemapEntry(171, 70, ProtocolVersion.MINECRAFT_1_5_2);
			// hardened clay -> clay
			registerRemapEntry(172, 82, ProtocolVersion.MINECRAFT_1_5_2);
			// coal block -> stone
			registerRemapEntry(173, 1, ProtocolVersion.MINECRAFT_1_5_2);
			// packed ice -> snow
			registerRemapEntry(174, 80, ProtocolVersion.MINECRAFT_1_5_2);
			// tall plant -> yellow flower
			registerRemapEntry(175, 38, ProtocolVersion.MINECRAFT_1_5_2);
		}
		@Override
		protected RemappingTable createTable() {
			return new RemappingTable(4096);
		}
	};

	public static final RemappingReigstry ITEM = new RemappingReigstry() {
		{
			copy(BLOCK);
			// all doors -> door
			registerRemapEntry(427, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(428, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(429, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(430, 324, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(431, 324, ProtocolVersionsHelper.BEFORE_1_8);
			// rabbit raw meat -> chicken raw meat
			registerRemapEntry(411, 365, ProtocolVersionsHelper.BEFORE_1_8);
			// rabbit cooked meat -> chicken cooked meat
			registerRemapEntry(412, 366, ProtocolVersionsHelper.BEFORE_1_8);
			// rabbit stew -> mushroom stew
			registerRemapEntry(413, 282, ProtocolVersionsHelper.BEFORE_1_8);
			// raw mutton -> chicken raw meat
			registerRemapEntry(423, 365, ProtocolVersionsHelper.BEFORE_1_8);
			// cooked mutton -> chicken cooked meat
			registerRemapEntry(424, 366, ProtocolVersionsHelper.BEFORE_1_8);
			// banner -> sign
			registerRemapEntry(425, 323, ProtocolVersionsHelper.BEFORE_1_8);
			// everything else -> stone
			registerRemapEntry(409, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(410, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(414, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(415, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(416, 1, ProtocolVersionsHelper.BEFORE_1_8);
			registerRemapEntry(417, 1, ProtocolVersion.MINECRAFT_1_5_2);
			registerRemapEntry(418, 1, ProtocolVersion.MINECRAFT_1_5_2);
			registerRemapEntry(419, 1, ProtocolVersion.MINECRAFT_1_5_2);
			registerRemapEntry(420, 1, ProtocolVersion.MINECRAFT_1_5_2);
			registerRemapEntry(421, 1, ProtocolVersion.MINECRAFT_1_5_2);
		}
		@Override
		protected RemappingTable createTable() {
			return new RemappingTable(4096);
		}
	};

}