
public class CanvasPath {


        public CanvasEngine(Context context) {
            this.mContext = context;
        }
  
  
  
        public void Path() {

        // Canvas Path

        float rx = 0;
        float ry = 0;


        // Path Square
        float[][] a_points = new float[][] {
          { { rx+0,  ry+0 },{ rx+0,  ry+10 },{ rx+10, ry+10 },{ rx+10, ry+0 },{ rx+0,  ry+0 } },

        }

          
        int style = 0;

        float x_var = 0;
        float y_var = 0;


        float x_base = 0;
        float y_base = 0;

        float quadx = 0.1f;
        float quady = 0.1f;


        Path path02 = new Path();

        float ux = 0;
        float uy = 0;


        if( REPLACE_CANVAS ==  1) {
            ux = mtx*tile;
            uy = mty*tile;

        }


        path02.moveTo( ((x_base + a_points[0][0])*quadx) + ux, (a_points[0][1]*quady) + uy );


        int c_end = a_points.length;
        for(int c = 0; c<c_end; c++ ) {

            x_var = (x_base + a_points[c][0]);
            y_var = a_points[c][1];


            path02.lineTo( (x_var*quadx) + ux, (y_var*quady) + uy );

        }

        path02.moveTo( ((x_base + a_points[0][0])*quadx) + ux, (a_points[0][1]*quady) + uy );


        Paint paint;
        paint = new Paint();


        if( style == 0 ) {

            paint.setColor(Color.parseColor(color));
        }


        // Draw canvas

        // canvas.drawPath(path02, paint);

        }
  
  
  
}


