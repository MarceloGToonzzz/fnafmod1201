package net.mcreator.fnafmod.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;

import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexBuffer;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.BufferBuilder;

public class GetMatToyMovementTextureUVsProcedure {
	private static BufferBuilder bufferBuilder = null;
	private static VertexBuffer vertexBuffer = null;
	private static VertexFormat.Mode mode = null;
	private static VertexFormat format = null;

	private static void add(double x, double y, double z, int color) {
		add(x, y, z, 0.0F, 0.0F, color);
	}

	private static void add(double x, double y, double z, float u, float v, int color) {
		if (bufferBuilder == null || !bufferBuilder.building())
			return;
		if (format == DefaultVertexFormat.POSITION_COLOR) {
			bufferBuilder.vertex(x, y, z).color(color).endVertex();
		} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
			bufferBuilder.vertex(x, y, z).uv(u, v).color(color).endVertex();
		}
	}

	private static boolean begin(VertexFormat.Mode mode, VertexFormat format, boolean update) {
		if (GetMatToyMovementTextureUVsProcedure.bufferBuilder == null || !GetMatToyMovementTextureUVsProcedure.bufferBuilder.building()) {
			if (update)
				clear();
			if (GetMatToyMovementTextureUVsProcedure.vertexBuffer == null) {
				if (format == DefaultVertexFormat.POSITION_COLOR) {
					GetMatToyMovementTextureUVsProcedure.mode = mode;
					GetMatToyMovementTextureUVsProcedure.format = format;
					GetMatToyMovementTextureUVsProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					GetMatToyMovementTextureUVsProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_COLOR);
					return true;
				} else if (format == DefaultVertexFormat.POSITION_TEX_COLOR) {
					GetMatToyMovementTextureUVsProcedure.mode = mode;
					GetMatToyMovementTextureUVsProcedure.format = format;
					GetMatToyMovementTextureUVsProcedure.bufferBuilder = Tesselator.getInstance().getBuilder();
					GetMatToyMovementTextureUVsProcedure.bufferBuilder.begin(mode, DefaultVertexFormat.POSITION_TEX_COLOR);
					return true;
				}
			}
		}
		return false;
	}

	private static void clear() {
		if (vertexBuffer != null) {
			vertexBuffer.close();
			vertexBuffer = null;
		}
	}

	private static void end() {
		if (bufferBuilder == null || !bufferBuilder.building())
			return;
		if (vertexBuffer != null)
			vertexBuffer.close();
		vertexBuffer = new VertexBuffer(VertexBuffer.Usage.STATIC);
		vertexBuffer.bind();
		vertexBuffer.upload(bufferBuilder.end());
		VertexBuffer.unbind();
	}

	private static VertexBuffer shape() {
		return vertexBuffer;
	}

	public static VertexBuffer execute() {
		return execute(null);
	}

	private static VertexBuffer execute(@Nullable Event event) {
		double xPos = 0;
		double xSiz = 0;
		double yPos = 0;
		double ySiz = 0;
		clear();
		xSiz = 1;
		ySiz = 1;
		xPos = 0;
		yPos = 0;
		if (begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.POSITION_TEX_COLOR, true)) {
			add(0, 0, 0, (float) xPos, (float) yPos, 255 << 24 | 255 << 16 | 255 << 8 | 255);
			add(0, 19, 0, (float) xPos, (float) (yPos + ySiz), 255 << 24 | 255 << 16 | 255 << 8 | 255);
			add(65, 19, 0, (float) (xPos + xSiz), (float) (yPos + ySiz), 255 << 24 | 255 << 16 | 255 << 8 | 255);
			add(65, 0, 0, (float) (xPos + xSiz), (float) yPos, 255 << 24 | 255 << 16 | 255 << 8 | 255);
			end();
		}
		return shape();
	}
}
