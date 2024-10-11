import unittest
from py_backwards.transformers.metaclass import *



class TestMetaclassTransformer(unittest.TestCase):
    def test_visit_Module(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_Module(ast.Module())
        self.assertEqual(result, None)

    def test_visit_ClassDef(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef())
        self.assertEqual(result, None)

    def test_visit_ClassDef_with_keywords(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef(keywords=[ast.keyword(arg='metaclass', value=ast.Name(id='metaclass'))]))
        self.assertEqual(result, None)

    def test_visit_ClassDef_with_keywords_and_bases(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef(keywords=[ast.keyword(arg='metaclass', value=ast.Name(id='metaclass'))], bases=[ast.Name(id='bases')]))
        self.assertEqual(result, None)

    def test_visit_ClassDef_with_keywords_and_bases_and_body(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef(keywords=[ast.keyword(arg='metaclass', value=ast.Name(id='metaclass'))], bases=[ast.Name(id='bases')], body=[ast.Pass()]))
        self.assertEqual(result, None)

    def test_visit_ClassDef_with_keywords_and_bases_and_body_and_decorator_list(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef(keywords=[ast.keyword(arg='metaclass', value=ast.Name(id='metaclass'))], bases=[ast.Name(id='bases')], body=[ast.Pass()], decorator_list=[ast.Name(id='decorator_list')]))
        self.assertEqual(result, None)

    def test_visit_ClassDef_with_keywords_and_bases_and_body_and_decorator_list_and_name(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef(keywords=[ast.keyword(arg='metaclass', value=ast.Name(id='metaclass'))], bases=[ast.Name(id='bases')], body=[ast.Pass()], decorator_list=[ast.Name(id='decorator_list')], name='name'))
        self.assertEqual(result, None)

    def test_visit_ClassDef_with_keywords_and_bases_and_body_and_decorator_list_and_name_and_starargs(self):
        instance = MetaclassTransformer(tree)
        result = instance.visit_ClassDef(ast.ClassDef(keywords=[ast.keyword(arg='metaclass', value=ast.Name(id='metaclass'))], bases=[ast.Name(id='bases')], body=[ast.Pass()], decorator_list=[ast.Name(id='decorator_list')], name='name', starargs='starargs'))
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()