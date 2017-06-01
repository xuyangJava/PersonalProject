<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<div class="sidebar" id="sidebar">
        <script type="text/javascript">
            try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
        </script>

        <div class="sidebar-shortcuts" id="sidebar-shortcuts">
            <div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
                <button class="btn btn-success">
                    <i class="icon-signal"></i>
                </button>
                <button class="btn btn-info">
                    <i class="icon-pencil"></i>
                </button>
                <button class="btn btn-warning">
                    <i class="icon-group"></i>
                </button>
                <button class="btn btn-danger">
                    <i class="icon-cogs"></i>
                </button>
            </div>

            <div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
                <span class="btn btn-success"></span>
                <span class="btn btn-info"></span>
                <span class="btn btn-warning"></span>
                <span class="btn btn-danger"></span>
            </div>
        </div><!-- #sidebar-shortcuts -->

        <!-- 菜单 -->
        <div id="left_menu_ul"></div>
        
        <div class="sidebar-collapse" id="sidebar-collapse">
            <i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
        </div>

        <script type="text/javascript">
            try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
        </script>
        
        <script type="text/javascript">
	        var zNodes=[
	           {id:0,pId:-1,name:"UI 组件", icon:"icon-dashboard"},
	            {id:1,pId:0,name:"控制台", icon:"icon-dashboard"},
			    {id:2,pId:0,name:"组件", icon:"icon-dashboard"},
			    {id:11,pId:0,name:"按钮 &amp; 图表", icon:"icon-double-angle-right"},
			    {id:12,pId:0,name:"树菜单", icon:"icon-double-angle-right"},
			    {id:13,pId:0,name:"三级菜单", icon:"icon-double-angle-right"},
			    {id:3,pId:13,name:"第一级", icon:"icon-double-angle-right"},
			    {id:21,pId:13,name:"第四级", icon:"icon-double-angle-right"},
			    {id:22,pId:21,name:"添加产品", icon:"icon-double-angle-right"},
			    {id:23,pId:21,name:"查看商品", icon:"icon-double-angle-right"},
			];
	        var ulCount = 1;
	        function treeMenu(a){
	            this.tree = a||[];
	            this.groups = {};
	            this.template = {
	                'nav-list-class' : 'nav nav-list',
	                'menu-class' : 'submenu'
	            }
	        };
	        treeMenu.prototype={
	            init:function(pid){
	                this.group();
	                return this.getDom(this.groups[pid]);
	            },
	            group:function(){
	                for(var i=0;i<this.tree.length;i++){
	                    if(this.groups[this.tree[i].pId]){
	                        this.groups[this.tree[i].pId].push(this.tree[i]);
	                    }else{
	                        this.groups[this.tree[i].pId]=[];
	                        this.groups[this.tree[i].pId].push(this.tree[i]);
	                    }
	                }
	            },
	            getDom:function(a){
	                if(!a){return ''}
	                console.log(a);
	                var ulClass = ulCount == 1 ? this.template['nav-list-class'] : this.template['menu-class'];
	                ulCount++;
	                var html='\n<ul class="' + ulClass + '">\n';
	                for(var i=0;i<a.length;i++){
	                    if(a[i].hasChd){
	                        html+='<li><a href="#"><i class="' + a[i].icon + '"\></i><span class="menu-text">'+a[i].name+'</span></a>';
	                    }else{
	                        html+='<li><a href="#"><i class="' + a[i].icon + '"\></i><span class="menu-text">'+a[i].name+'</span><b class="arrow icon-angle-down"></b></a>';
	                    }
	                    html+=this.getDom(this.groups[a[i].id]);
	                    html+='</li>\n';
	                };
	                html+='</ul>\n';
	                
	                return html;
	            }
	        };
	        var html=new treeMenu(zNodes).init(0);
	        console.log(html);
	        document.getElementById('sidebar-shortcuts').innerHTML = html;
        </script>
    </div>