package handler;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpUtil;

import java.util.logging.FileHandler;

public class FileUploadHandler extends ChannelInboundHandlerAdapter{
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if(msg instanceof HttpRequest){
            //因为在前面已经做了netty封装好的httpEncoder的流程，这里的对象就被转换成HttpRequest对象了
            HttpRequest request = (HttpRequest) msg;
            boolean keepAlive = HttpUtil.isKeepAlive(request);
            long contentLength = HttpUtil.getContentLength(request);
        }
        super.channelRead(ctx, msg);
    }

}
