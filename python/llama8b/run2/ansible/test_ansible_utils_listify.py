import unittest
from ansible.module_utils.basic import listif


class TestListify(unittest.TestCase):
    def test_listify_string(self):
        terms = "hello,world"
        templar = object()
        loader = object()
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ["hello", "world"])

    def test_listify_list(self):
        terms = ["hello", "world"]
        templar = object()
        loader = object()
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ["hello", "world"])

    def test_listify_dict(self):
        terms = {"hello": "world"}
        templar = object()
        loader = object()
        with self.assertRaises(TypeError):
            listify.listify_lookup_plugin_terms(terms, templar, loader)

    def test_listify_iterable(self):
        terms = [1, 2, 3]
        templar = object()
        loader = object()
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, [1, 2, 3])

    def test_listify_non_iterable(self):
        terms = object()
        templar = object()
        loader = object()
        with self.assertRaises(TypeError):
            listify.listify_lookup_plugin_terms(terms, templar, loader)

    def test_listify_template_string(self):
        terms = "hello {{ world }}"
        templar = object()
        loader = object()
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ["hello world"])

    def test_listify_template_list(self):
        terms = ["hello {{ world }}, {{ foo }}"]
        templar = object()
        loader = object()
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, ["hello world, foo"])

    def test_listify_template_dict(self):
        terms = {"hello": " {{ world }}"}
        templar = object()
        loader = object()
        with self.assertRaises(TypeError):
            listify.listify_lookup_plugin_terms(terms, templar, loader)

    def test_listify_template_iterable(self):
        terms = [1, 2, " {{ world }}"]
        templar = object()
        loader = object()
        result = listify.listify_lookup_plugin_terms(terms, templar, loader)
        self.assertEqual(result, [1, 2, " world"])

    def test_listify_template_non_iterable(self):
        terms = object()
        templar = object()
        loader = object()
        with self.assertRaises(TypeError):
            listify.listify_lookup_plugin_terms(terms, templar, loader)

if __name__ == '__main__':
    unittest.main()