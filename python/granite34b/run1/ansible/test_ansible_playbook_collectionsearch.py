import unittest
from ansible.playbook.collectionsearch import CollectionSearch
from ansible.utils.collection_loader import AnsibleCollectionConfig
from ansible.template import Environment
from ansible.utils.display import Display


class TestCollectionSearch(unittest.TestCase):
    def test_load_collections(self):
        search = CollectionSearch()
        collections = search.get_validated_value('collections', search._collections, ['a', 'b', 'c'], [])
        self.assertEqual(collections, ['a', 'b', 'c'])
        env = Environment()
        for collection_name in collections:
            if is_template(collection_name, env):
                display.warning('"collections" is not templatable, but we found: %s, '
                                'it will not be templated and will be used "as is".' % (collection_name))
        self.assertEqual(len(collections), 3)

if __name__ == '__main__':
    unittest.main()