import unittest
from ansible.playbook.collectionsearch import CollectionSearch, _ensure_default_collection
from ansible.playbook.attribute import FieldAttribute
from ansible.utils.collection_loader import AnsibleCollectionConfig
from ansible.template import is_template, Environment
from ansible.utils.display import Display


class TestEnsureDefaultCollection(unittest.TestCase):
    def test_ensure_default_collection_none(self):
        result = _ensure_default_collection(None)
        self.assertIn(AnsibleCollectionConfig.default_collection, result.keys())

    def test_ensure_default_collection_empty(self):
        result = _ensure_default_collection([])
        self.assertIn(AnsibleCollectionConfig.default_collection, result.keys())

    def test_ensure_default_collection_with_builtin(self):
        result = _ensure_default_collection(['ansible.builtin'])
        self.assertIn('ansible.builtin', result)

    def test_ensure_default_collection_with_legacy(self):
        result = _ensure_default_collection(['ansible.legacy'])
        self.assertIn('ansible.legacy', result)

    def test_ensure_default_collection_with_custom(self):
        result = _ensure_default_collection(['custom.collection'])
        self.assertIn('custom.collection', result)
        self.assertIn('ansible.legacy', result)

class TestCollectionSearch(unittest.TestCase):
    def setUp(self):
        self.instance = CollectionSearch()

    def test_load_collections_empty(self):
        result = self.instance.load_collections('collections', [])
        self.assertIsNone(result)

    def test_load_collections_with_valid(self):
        result = self.instance._load_collections('collections', ['ansible.builtin'], validate=True)
        self.assertIn('ansible.builtin', result)

    def test_load_collections_with_template_warning(self):
        with self.assertLogs('ansible.utils.display', level='WARNING') as cm:
            self.instance._load_collections('collections', ['template'])
            self.assertIn('WARNING:ansible.utils.display:"collections" is not templatable, but we found: {{ template }}, it will not be templated and will be used "as is".', cm.output)

if __name__ == '__main__':
    unittest.main()