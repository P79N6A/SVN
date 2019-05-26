/**
 * @description 菜单数据
 */

export default {
    data:[
          {
        	  icon:'el-icon-menu',
        	  menuName:'首页',
        	  path:'home',
          },
          {
        	  icon:'el-icon-edit',
        	  menuName:'考试管理',
        	  path:null, 
        	  children:[
					{
					  icon:'el-icon-arrow-right',
					  menuName:'考试列表',
					  path:'examList',
					}, 
					{
					  icon:'el-icon-arrow-right',
					  menuName:'双向细目表',
					  path:'twoWayTable',
					}, 
        	  ]
          },
          {
        	  icon:'el-icon-share',
        	  menuName:'资源管理',
        	  path:null, 
        	  children:[
					{
					  icon:'el-icon-arrow-right',
					  menuName:'知识点',
					  path:'knowledgePoint'
					}
        	  ]
          },
          {
        	  icon:'el-icon-date',
        	  menuName:'学校管理',
        	  path:null, 
        	  children:[
					{
					  icon:'el-icon-arrow-right',
					  menuName:'学校信息',
					  path:'schoolInfo'
					}, 
					{
					  icon:'el-icon-arrow-right',
					  menuName:'班级信息',
					  path:'classInfo'
					},
					{
					  icon:'el-icon-arrow-right',
					  menuName:'学科信息',
					  path:'subjectInfo'
					}, 
					{
					  icon:'el-icon-arrow-right',
					  menuName:'教师信息',
					  path:'teacherInfo'
					},
					{
					  icon:'el-icon-arrow-right',
					  menuName:'学生信息',
					  path:'studentInfo'
					}
        	  ]
          },
          {
        	  icon:'el-icon-setting',
        	  menuName:'系统设置',
        	  path:null, 
        	  children:[
					{
					  icon:'el-icon-arrow-right',
					  menuName:'角色管理',
					  path:'roleManager'
					}, 
					{
					  icon:'el-icon-arrow-right',
					  menuName:'用户管理',
					  path:'userManager'
					},
					{
					  icon:'el-icon-arrow-right',
					  menuName:'机构管理',
					  path:'orgManager'
					}
        	  ]
          },
          
    ]
}